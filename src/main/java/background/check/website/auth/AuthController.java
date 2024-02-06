package background.check.website.auth;

import background.check.website.Property.Property;
import background.check.website.squareApi.SquareResponse;
import background.check.website.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody RegisterRequest request
    ) {
        System.out.println("register test");
        System.out.println(request);
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/register/complete")
    public User registerComplete (
            @RequestBody RegisterCompleteRequest request
    ) {
        return authService.completeRegistration(request);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (
            @RequestBody AuthenticationRequest request
    ) {
        System.out.println("auth test");
        System.out.println(request);
        return ResponseEntity.ok(authService.authenticate(request));
    }

    @PostMapping("/refresh-token")
    public void refreshToken (
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        authService.refreshToken(request, response);
    }

    @GetMapping("/users")
    public List<User> getUsers (
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        return authService.getUsers(request, response);
    }

    @GetMapping("/get-payment")
    public SquareResponse getLink (
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        System.out.println("get payment endpoint");
        return authService.getPaymentLink();
    }

    @GetMapping("/properties")
    public List<Property> getProperties (
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        System.out.println("get property endpoint");
        return authService.getProperties();
    }

    @GetMapping("/confirm/{id}")
    public void confirmAccount (
            HttpServletRequest request,
            HttpServletResponse response,
            @PathVariable String id
    ) throws IOException {
        authService.confirmAccount(id);
        response.setHeader("Location", "https://engelrealestate.us/");
        response.setStatus(302);
    }
}
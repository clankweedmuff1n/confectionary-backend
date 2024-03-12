package background.check.website.products.GalleryItem.service;

import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.GalleryItem.GalleryItemRepository;
import background.check.website.products.GalleryItem.GalleryItemRequest;
import background.check.website.products.GalleryItem.mapper.GalleryItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GalleryItemServiceImpl implements GalleryItemService {
    private final GalleryItemRepository galleryItemRepository;
    private final GalleryItemMapper mapper;

    public GalleryItem createGalleryItem(GalleryItemRequest galleryItemRequest) {
        return galleryItemRepository.save(mapper.toGalleryItem(galleryItemRequest));
    }

    public List<GalleryItem> createGalleryItemAll(List<GalleryItemRequest> galleryItemRequests) {
        return galleryItemRepository.saveAll(galleryItemRequests.stream().map(mapper::toGalleryItem).toList());
    }
}

package background.check.website.products.GalleryItem.service;

import background.check.website.products.GalleryItem.GalleryItem;
import background.check.website.products.GalleryItem.GalleryItemRequest;

import java.util.List;

public interface GalleryItemService {
    GalleryItem createGalleryItem(GalleryItemRequest galleryItemRequest);

    List<GalleryItem> createGalleryItemAll(List<GalleryItemRequest> galleryItemRequests);
}

package com.wishstore.history.dto.request;

import com.wishstore.history.enums.ActionType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryRequest {

    @NotNull(message = "Wishlist ID is required")
    private Long wishlistId;

    @NotNull(message = "Product ID is required")
    private Long productId;

    @NotNull(message = "Action is required")
    private ActionType action;

    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;

}
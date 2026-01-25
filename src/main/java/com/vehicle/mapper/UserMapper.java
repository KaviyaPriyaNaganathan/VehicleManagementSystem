package com.vehicle.mapper;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;
import com.vehicle.models.User;

package com.vehicle.mapper;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;
import com.vehicle.models.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPasword(dto.getPassword());
        user.setRole(dto.getRole());
        user.setActive(dto.getActive() == null ? true : dto.getActive());

        return user;
    }

    public static UserResponseDTO toResponse(User entity) {
        UserResponseDTO response = new UserResponseDTO();
        response.setId(entity.getId());
        response.setUsername(entity.getUsername());
        response.setRole(entity.getRole());
        response.setActive(entity.isActive());
        response.setCreatedAt(entity.getCreatedAt());
        response.setLastLoginAt(entity.getLastLoginAt());
        return response;
    }
}

package be.vinci.ipl.cae.demos.auths.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticatedUser {
    private String username;
    private String token;
}

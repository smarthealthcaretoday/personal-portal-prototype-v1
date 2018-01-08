package today.smarthealthcare.ppv1.services;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import com.auth0.jwt.JWTSigner;
import org.springframework.stereotype.Service;

import java.util.HashMap;

import today.smarthealthcare.ppv1.dto.patient.PatientDto;

/**
 * JWT service
 */
@Service
public class JwtService {

    private final JWTSigner signer = new JWTSigner("my secret");
    private final JWTSigner.Options options = new JWTSigner.Options().setExpirySeconds(1800);

    public String createAndSignToken(PatientDto user) {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("id", user.getId());
        claims.put("name", user.getName() + " " + user.getSurname());
        claims.put("role", user.getRole());

        return signer.sign(claims, options);
    }
}

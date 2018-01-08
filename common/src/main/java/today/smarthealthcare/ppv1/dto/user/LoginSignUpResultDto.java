package today.smarthealthcare.ppv1.dto.user;

import today.smarthealthcare.ppv1.dto.util.ResultDto;
import com.google.common.base.MoreObjects;

import today.smarthealthcare.ppv1.dto.util.ResultDto;

/**
 * Login or sign up result
 */
public class LoginSignUpResultDto extends ResultDto {
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("ResultDto", super.toString())
				.add("token", token)
				.toString();
	}
}

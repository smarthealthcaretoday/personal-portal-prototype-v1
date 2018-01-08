package today.smarthealthcare.ppv1.dto.user;

import java.io.Serializable;

import com.google.common.base.MoreObjects;

/**
 * App user DTO
 */
public class UserDto implements Serializable {

	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserDto userDto = (UserDto)o;

		if (email != null ? !email.equals(userDto.email) : userDto.email != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("email", email)
				.add("password", password)
				.toString();
	}
}

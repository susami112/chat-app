package in.tech_camp.chat_app.custom_user;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import in.tech_camp.chat_app.entity.UserEntity;
import lombok.Data;

@Data
public class CustomUserDetail implements UserDetails {
  private final UserEntity user;

  public CustomUserDetail(UserEntity user) {
      this.user = user;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
      return Collections.emptyList();
  }

  @Override
  public String getPassword() {
      return user.getPassword();
  }

  @Override
  public String getUsername() {
      return user.getEmail();
  }

  public Integer getId() {
      return user.getId();
  }

  public String getName() {
      return user.getName();
  }

  @Override
  public boolean isAccountNonExpired() {
      return true;
  }

  @Override
  public boolean isAccountNonLocked() {
      return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
      return true;
  }

  @Override
  public boolean isEnabled() {
      return true;
  }
}
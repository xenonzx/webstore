package com.megastores.webstore.security;

import com.megastores.webstore.dataEntities.User;
import com.megastores.webstore.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(username);

        return new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                if (user.isPresent()) {
                    return Arrays.asList(new SimpleGrantedAuthority(user.get().getAuthorities()));
                } else {
                    return null;
                }
            }

            @Override
            public String getPassword() {
                if (user.isPresent()) {
                    return user.get().getPassword();
                } else {
                    return "";
                }
            }

            @Override
            public String getUsername() {
                if (user.isPresent()) {
                    return user.get().getUsername();
                } else {
                    return "";
                }
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
        };

    }
}

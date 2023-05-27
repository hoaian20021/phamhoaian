package phamhoaian.lab3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import phamhoaian.lab3.entity.CustomUserDetail;
import phamhoaian.lab3.entity.User;
import phamhoaian.lab3.repository.IUserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername (String username)throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if(user== null)
            throw new UsernameNotFoundException("user not found");
        return  new CustomUserDetail(user,userRepository);
    }
}

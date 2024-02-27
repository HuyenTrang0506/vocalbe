package net.codejava.service;

import net.codejava.entity.User;
import net.codejava.entity.Vocabulary;

import java.security.Principal;
import java.util.List;

public interface UserService {
    User save(User user);

    User changePassword(String oldPassword, String password, Principal principal);
    User forgotPassword(String email);

    User changeAvatar(String url, Principal principal);

    User changePro(Long id);

    User changePro(String email);

    Boolean delete(User user);

    List<User> getAllUser();
    Boolean sendEmail(String to, String subject, String body) ;
    User findUserByEmail(String email);

    List<Vocabulary> findVocabByUser(Principal principal);

    Boolean checkPro(Principal principal);

    List<Vocabulary> findVocabNotRememberByUser(Principal principal);
}

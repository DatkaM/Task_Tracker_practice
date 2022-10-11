//package taskTracker.dto;
//
//import org.springframework.stereotype.Component;
//import taskTracker.dto.response.LoginResponse;
//import taskTracker.model.AuthInfo;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Component
//public class Login {
//
//    public LoginResponse toLoginView(String token, String message, AuthInfo authInfo){
//        var loginResponse = new LoginResponse();
//        if (authInfo != null){
//            getAuthority(loginResponse, authInfo.getRoles());
//        }
//        loginResponse.setMessage(message);
//        loginResponse.setJwtToken(token);
//        return loginResponse;
//    }
//
//    private void getAuthority(LoginResponse loginResponse, List<Role> roles){
//        Set<String> authorities = new HashSet<>();
//        for (Role role : roles) {
//            authorities.add(role.getRoleName());
//        }
//        loginResponse.setAuthorities(authorities);
//    }
//}

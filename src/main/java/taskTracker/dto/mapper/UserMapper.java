//package taskTracker.dto.mapper;
//
//import org.springframework.stereotype.Component;
//import taskTracker.dto.request.RegisterRequest;
//import taskTracker.dto.response.UserResponse;
//
//import taskTracker.model.User;
//
//@Component
//public class UserMapper {
//
//
//    public User mapToEntityAdminRole(RegisterRequest request) {
//        User user = new User();
//        user.setName(request.getName());
//        user.setSurname(request.getSurname());
//        // kak vsavlyayut photo v profile
////        user.setPhotoLink();
//        AuthInfo info = new AuthInfo();
//        info.setEmail(request.getEmail());
//        info.setPassword(request.getPassword());
//        Role role = new Role();
//        role.setRoleName("Admin");
//        info.addRole(role);
//        role.addAuthInfo(info);
//        user.setAuthInfo(info);
//        return user;
//    }
//
//    public User mapToEntityUserRole(RegisterRequest request) {
//        User user = new User();
//        user.setName(request.getName());
//        user.setSurname(request.getSurname());
//        // kak vsavlyayut photo v profile
////        user.setPhotoLink();
//        AuthInfo info = new AuthInfo();
//        info.setEmail(request.getEmail());
//        info.setPassword(request.getPassword());
//        Role role = new Role();
//        role.setRoleName("User");
//        info.addRole(role);
//        role.addAuthInfo(info);
//        user.setAuthInfo(info);
//        return user;
//    }
//
//    public UserResponse mapToResponse(User user) {
//        UserResponse userResponse = new UserResponse();
//        userResponse.setId(user.getId());
//        userResponse.setName(userResponse.getName());
//        userResponse.setSurname(user.getSurname());
//        userResponse.setPhoto(user.getPhotoLink());
//        userResponse.setEmail(user.getAuthInfo().getEmail());
//        userResponse.setRole(user.getAuthInfo().getRoles().get(Math.toIntExact(user.getId())));
//        return userResponse;
//    }
//}

//package taskTracker.api;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import taskTracker.dto.Login;
//import taskTracker.dto.request.AuthInfoRequest;
//import taskTracker.dto.request.LoginRequest;
//import taskTracker.dto.response.AuthInfoResponse;
//import taskTracker.dto.response.LoginResponse;
//import taskTracker.model.AuthInfo;
//import taskTracker.repository.AuthInfoRepository;
//import taskTracker.security.jwt.JwtTokenUtil;
//import taskTracker.service.AuthInfoService;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/jwt")
//public class AuthInfoApi {
//
////    private final AuthInfoService authInfoService;
//    private final AuthInfoRepository authInfoRepository;
//    private final JwtTokenUtil jwtTokenUtil;
//    private final Login login;
//    private final AuthenticationManager authenticationManager;
//
//    @PostMapping("login")
//    public ResponseEntity<LoginResponse> getLogin(@RequestBody LoginRequest request){
//        try {
//            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(request.getEmail(),
//                    request.getPassword());
//            authenticationManager.authenticate(token);
//
//            AuthInfo authInfo = authInfoRepository.findByEmail(token.getName()).get();
//            return ResponseEntity.ok().body(login.toLoginView(jwtTokenUtil.generateToken(authInfo), "Successfully", authInfo));
//
//        }catch (BadCredentialsException ex){
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                    .body(login.toLoginView("","Login_failed", null));
//        }
//    }
//
//
//}

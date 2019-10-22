//package com.spring.specurity.security;
//
//import com.imagjs.manager.entity.User;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//
//public class SecurityContext {
//
//    private static User mockUser;
//
//    /**
//     * Service单元测试里设置测试用的User
//     * @param user
//     */
//    public static void setServiceMockUser(User user) {
//        SecurityContext.mockUser = user;
//    }
//
//    /**
//     * 获得当前登录用户
//     * @return
//     */
//    public static User getCurrentUser() {
//        if (SecurityContext.mockUser != null) {
//            return SecurityContext.mockUser;
//        }
//        org.springframework.security.core.context.SecurityContext context = SecurityContextHolder.getContext();
//        if (context == null || context.getAuthentication() == null) {
//            return null;
//        }
//        Object obj = context.getAuthentication().getPrincipal();
//        return (obj instanceof User) ? (User) obj : null;
//    }
//
//    /**
//     * 获得当前用户的id
//     * @return
//     */
//    public static Long getCurrentUserId() {
//        return (getCurrentUser() == null) ? 0L : getCurrentUser().getId();
//    }
//
//    /**
//     * 判断是否有某个用户权限
//     * @param role
//     * @return
//     */
//    public static boolean hasAuthority(String role) {
//        org.springframework.security.core.context.SecurityContext context = SecurityContextHolder.getContext();
//        if (context == null || context.getAuthentication() == null) {
//            return false;
//        }
//        Authentication authentication = context.getAuthentication();
//        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority(role))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//}

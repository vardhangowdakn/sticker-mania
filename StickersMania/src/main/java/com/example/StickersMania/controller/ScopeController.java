package com.example.StickersMania.controller;

import com.example.StickersMania.scopes.ApplicationScopedBean;
import com.example.StickersMania.scopes.RequestScopedBean;
import com.example.StickersMania.scopes.SessionScopedBean;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/scope")
@RequiredArgsConstructor
public class ScopeController {
        private final RequestScopedBean requestScopedBean;
    private final SessionScopedBean sessionScopedBean;
    private final ApplicationScopedBean applicationScopedBean;

    @GetMapping("/request")
        public ResponseEntity<String> testRequestScope() {
            requestScopedBean.setUserName("John Doe");
            return ResponseEntity.ok().body(requestScopedBean.getUserName());
        }

    @GetMapping("/session")
    public ResponseEntity<String> testSessionScope() {
        sessionScopedBean.setUserName("John Doe");
        return ResponseEntity.ok().body(sessionScopedBean.getUserName());

    }

    @GetMapping("/application")
    public ResponseEntity<Integer> testApplicationScope() {
        applicationScopedBean.incrementVisitorCount();
        return ResponseEntity.ok().body(applicationScopedBean.getVisitorCount());
    }

    @GetMapping("/test")
    public ResponseEntity<Integer> testScope() {
        return ResponseEntity.ok().body(applicationScopedBean.getVisitorCount());
    }


}

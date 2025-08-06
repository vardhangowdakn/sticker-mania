package com.example.StickersMania.scopes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@Component
@RequestScope
@Getter
@Setter
public class RequestScopedBean {

        private String userName;

        public RequestScopedBean() {
            log.info("RequestScopeBean initialized");
        }

}

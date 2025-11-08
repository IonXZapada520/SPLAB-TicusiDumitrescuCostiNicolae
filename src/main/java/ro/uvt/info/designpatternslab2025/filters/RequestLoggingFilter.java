package ro.uvt.info.designpatternslab2025.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {


    private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        long startTime = System.currentTimeMillis();


        LOG.info("[REQUEST] Metodă: {}; URI: {}", req.getMethod(), req.getRequestURI());


        chain.doFilter(request, response);

        long duration = System.currentTimeMillis() - startTime;
        LOG.info("[RESPONSE] Durată: {}ms", duration);
    }
}
package br.univille.cademeututor.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.univille.cademeututor.services.impl.UserServiceDetail;
 
@EnableWebSecurity()
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserServiceDetail userServiceDetail;

    @Autowired
    private JWTRequestFilter jwtRequestFilter;
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userServiceDetail);
    }
     
    @Bean
    public PasswordEncoder passwordEncoder() {
        //return NoOpPasswordEncoder.getInstance();
        //https://en.wikipedia.org/wiki/Bcrypt
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests().antMatchers("/api/v1/auth/signin","/swagger-ui.html","/webjars/**","/v2/api-docs/**","/swagger-resources/**").permitAll()
            .antMatchers("/api/**").authenticated()
            .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests().antMatchers("/fonte_dados/**").permitAll().and().headers().frameOptions().disable()
            .and()
            .authorizeRequests().antMatchers("/**").authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
            .and().formLogin().permitAll()
            .defaultSuccessUrl("/", true).and().logout().permitAll();
         
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
        // http.headers().frameOptions().disable();
    }
    @Override
    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        // TODO Auto-generated method stub
        return super.authenticationManager();
    }

}
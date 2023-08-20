package tech.ada.java.lotofacil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain( HttpSecurity http ) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable)
		.authorizeHttpRequests( (requests) -> { 
			
			requests
			.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**"))
            .permitAll()
            .requestMatchers(AntPathRequestMatcher.antMatcher("/usuario/**") )
			.permitAll()

            .requestMatchers(AntPathRequestMatcher.antMatcher( "/v1/**" ) )
			.authenticated()
			;
		} )
		.httpBasic( Customizer.withDefaults() );
		
		return http.build();
	}
	
	@Bean
	public AuthenticationProvider authProvider( UserDetailsService userDetailsService) {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService( userDetailsService );
		daoAuthenticationProvider.setPasswordEncoder( new BCryptPasswordEncoder() );
		return daoAuthenticationProvider;
		
	}
	
	@Bean
	public AuthenticationManager authenticationManager( AuthenticationConfiguration authenticationConfiguration ) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}
	
}

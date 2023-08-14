package tech.ada.java.lotofacil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain( HttpSecurity http ) throws Exception {
		http.authorizeHttpRequests( 
					requests -> requests.requestMatchers( new AntPathRequestMatcher( "/lotofacil" ) ).permitAll() )
			.authorizeHttpRequests( 
					requests -> requests.requestMatchers( new AntPathRequestMatcher( "/usuario") ).authenticated() )
			.httpBasic( Customizer.withDefaults() );
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withUsername("teste").password("12345").build();
		return new InMemoryUserDetailsManager(user);
	}
}

package ai.mcp.server.remote.sse_demo;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SseDemoApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider mathTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new MathTools()).build();
	}
}

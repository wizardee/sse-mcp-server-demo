package ai.mcp.server.remote.sse_demo;

import org.springframework.ai.tool.annotation.Tool;

public class MathTools {

    @Tool(description = "Sum two numbers")
    public int sumNumbers(int a, int b) {
        return a + b;
    }

    @Tool(description = "Multiply two numbers")
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }
}

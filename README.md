# SSE MCP Server Demo

Spring AI MCP (Model Context Protocol) 서버의 Server-Sent Events (SSE) 기반 데모 애플리케이션입니다.

## 개요

이 프로젝트는 Spring AI의 MCP 서버 기능을 활용하여 SSE를 통해 실시간으로 AI 툴과 통신할 수 있는 데모 애플리케이션입니다. 기본적인 수학 연산 툴(덧셈, 곱셈)을 제공하며, MCP 프로토콜을 통해 AI 모델과 상호작용할 수 있습니다.

## 기술 스택

- **Java**: 17
- **Spring Boot**: 3.5.5
- **Spring AI**: 1.0.1
- **Build Tool**: Maven
- **Protocol**: Model Context Protocol (MCP)
- **Communication**: Server-Sent Events (SSE)
- **Security**: HTTPS/SSL 지원

## 주요 기능

### 1. MCP 서버 기능
- MCP 프로토콜을 통한 AI 모델과의 통신
- SSE 기반 실시간 메시징
- 툴, 리소스, 프롬프트 변경 알림 지원

### 2. 수학 툴
- **덧셈**: 두 정수의 합계 계산
- **곱셈**: 두 정수의 곱셈 계산

### 3. SSE 엔드포인트
- `/api/v1/sse`: SSE 연결 엔드포인트
- `/api/v1/mcp/message`: MCP 메시지 처리 엔드포인트

## 프로젝트 구조

```
src/
├── main/
│   ├── java/ai/mcp/server/remote/sse_demo/
│   │   ├── SseDemoApplication.java    # 메인 애플리케이션 클래스
│   │   └── MathTools.java             # 수학 연산 툴 구현
│   └── resources/
│       └── application.yml            # 애플리케이션 설정
└── test/
    └── java/ai/mcp/server/remote/sse_demo/
        └── SseDemoApplicationTests.java
```

## 설정

### 서버 설정
- **포트**: 48088
- **프로토콜**: HTTPS
- **SSL**: 자체 서명 인증서 (개발용)
- **최대 업로드 크기**: 2MB

### MCP 설정
- **서버 이름**: sse-mcp-server-demo
- **버전**: 0.0.1
- **SSE 활성화**: true
- **변경 알림**: 툴, 리소스, 프롬프트 변경 시 알림 제공

## 실행 방법

### 1. 사전 요구사항
- Java 17 이상
- Maven 3.6 이상

### 2. 애플리케이션 실행

```bash
# Maven을 사용한 실행
./mvnw spring-boot:run

# 또는 JAR 빌드 후 실행
./mvnw clean package
java -jar target/sse-demo-0.0.1-SNAPSHOT.jar
```

### 3. 애플리케이션 확인
애플리케이션이 정상적으로 실행되면 `https://localhost:48088`에서 접근할 수 있습니다.

## API 사용법

### SSE 연결
```bash
# HTTPS 연결 (자체 서명 인증서이므로 -k 옵션 필요)
curl -N -k https://localhost:48088/api/v1/sse
```

### MCP 메시지 전송
MCP 프로토콜을 따르는 클라이언트를 통해 수학 툴 호출이 가능합니다.

## 개발 및 테스트

### 테스트 실행
```bash
./mvnw test
```

### 빌드
```bash
./mvnw clean package
```

## 로깅

개발 중 디버깅을 위해 다음 로그 레벨이 설정되어 있습니다:
- `io.modelcontextprotocol`: TRACE
- `org.springframework.ai.mcp`: TRACE

## 라이센스

이 프로젝트는 데모 목적으로 작성되었습니다.

## 기여

버그 리포트나 기능 요청은 이슈를 통해 제출해 주세요.
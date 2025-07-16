# eApprovalSystem

Spring Boot 기반의 사내 전자결재 시스템입니다. 결재 요청, 승인/반려 처리, 공지사항 관리, 회원 관리를 지원합니다.

##  프로젝트 소개

**eApprovalSystem** 사내 결재 디지털화하여 효율적인 결재 절차를 제공합니다.  


- 로그인(사용자 정보 인증, 인가)
- 로그인(공인인증서 로그인과 유사한 기능 구현)
- 결재 문서 작성, 결재 승인/반려 처리
- 결재 상태별 조회 (결재대기/승인/반려)
- 공지사항 CRUD
- 관리자 기능

## ️ 사용 기술 스택

| 구분         | 기술 스택                          |
| ------------ | ---------------------------------- |
| Language     | Java 21                           |
| Framework    | Spring Boot, Spring Data JPA      |
| View Engine  | Thymeleaf                         |
| Database     | MariaDB, OracleDB       |
| Build Tool   | Gradle                            |
| Versioning   | Git                               |
| IDE          | SpringToolsForEclipse          |

##  프로젝트 폴더 구조

├── controller
│   ├── MainController.java
│   ├── MemberController.java
│   └── NoticeController.java
├── dto
│   ├── MemberDto.java
│   ├── NoticeDto.java
│   └── PendingDto.java
├── entity
│   ├── Member.java
│   ├── Notice.java
│   └── Pending.java
├── repository
│   ├── MemberRepository.java
│   ├── NoticeRepository.java
│   └── PendingRepository.java
├── service
│   ├── CertificateService.java
│   ├── MemberService.java
│   └── NoticeService.java
└── resources
    ├── static/
    ├── templates/
    └── application.properties
## ⚙️ 실행 방법(시현 영상으로 대체 예정)

```bash
# 1. 저장소 클론
git clone https://github.com/your-username/eApprovalSystem.git
cd eApprovalSystem

# 2. 빌드 및 실행
./gradlew bootRun

# 또는 jar 실행 시
./gradlew build
java -jar build/libs/eApprovalSystem-0.0.1-SNAPSHOT.jar
```
기본 포트는 8080입니다.

## 주요 기능 정리
- 회원가입, 로그인 (세션 기반 인증)
- 결재 작성/조회/상태 변경 (대기 → 승인 or 반려)
- 공지사항 등록/수정/삭제
- 관리자 기능

## 테스트
추후 단위 테스트 및 통합 테스트 예정



## 제작자
seongsik-17

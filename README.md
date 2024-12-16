# Gateway Server

프로젝트 USA(가칭)의 게이트웨이 서버.

Micro Service들의 라우팅을 담당한다. Eureka 서버 덕에 각 MS의 application name만 알고 있다면 
라우팅이 가능하다.


## Configuration
- Port: 9000
- Ip: localhost(추후 변경 예정)
- Filter: 
    - RewritePath: "/OO-service/path"로 들어온 uri를 "/path"로 재정의 해서 해당 MS 로 보내어 MS 입장에서는 각 endpoint마다 /OO-service 를 붙여주는걸 생략하게 해준다.
    - CustomFilter : Pre filter 와 Post filter로 나누어져 각 필터가 가지고 있는 정보를 로깅한다. 로깅 정보는 추후 보충 예정.


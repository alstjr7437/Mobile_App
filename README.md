# 2학년 2학기 모바일 앱 강의
[운동 소개앱](https://cyber-steer.github.io/portfolio_m) <br>
[모바일 포트폴리오](https://cyber-steer.github.io/portfolio_m) <br>

# 운동 소개앱
![앱 시작](운동 소개 앱/img/workapp1.jpg) <br>
![운동 설명](운동 소개 앱/img/workapp2.jpg) <br>
![운동 영상](운동 소개 앱/img/workapp3.jpg) <br>
![운동 사진](운동 소개 앱/img/workapp4.jpg) <br>

# 모바일 포트폴리오

<hr/>
# 사용한 framework
[jquery mobile](https://jquerymobile.com/) <br>
[bootstrap](https://getbootstrap.com/) <br>
[uikit](https://getuikit.com/) <br>
[bulma](https://bulma.io/) <br>

# 화면
![첫 화면](포트폴리오 앱/img/mportfolio.JPG)

# 페이지별 framework 사용 현황
- main.html
  + jquery mobile
- info.html
  + jquery mobile
  + bulma
- intro.html
  + jquery mobile
  + bootstrap
- project.html
  + jquery mobile
  + uikit
- project1~8.html
  + jquery mobile

# jquery mobile css 사용
```html
<div data-role="page">
    <div data-role="panel">
    </div>
    <div data-role="header">
    </div>
    <div data-role="content">
    </div>
    <div data-role="footer">
    </div>
</div>
```
기본적으로 모바일 형식을 구현하기 위해 모든 부분에 [jquery mobile](https://jquerymobile.com/) 사용


# bootstrap 사용
![레이아웃](https://github.com/cyber-steer/portfolio_m/blob/main/media/img/markdown/project_bootstrap.png)

```html
<div class="container text-center">
    <div class="row">
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
        </div>
    </div>
</div>
```
가장 큰 div가 가운데 정렬을 시켜주고 <br>
class가 row인 div안에 col-sm-4를 넣어줍니다 <br>
row는 한 행을 뜻하며 col-sm-4는 행의 크기를 12로 잡고 셀 크기를 4/12만큼 잡으며 셀 크기가 575px이하가 되면 자동으로 다시 레이아웃을 정렬하는 반응형 웹 구조입니다
[참조](https://getbootstrap.com/docs/5.2/layout/grid/) <br>

```html

[참조](https://getbootstrap.com/docs/5.2/layout/grid/) <br>


# bulma 사용
### 카드 만들기

클릭시 옮겨가는 카드 만들기
![레이아웃](포트폴리오 앱/img/bulma1.JPG
![레이아웃](포트폴리오 앱/img/bulma2.JPG)

```html
<a href ="https://github.com/alstjr7437">
	<div class="card">
		<div class="card-content">
			<div class="media">
				<div class="media-left">
				  <figure class="image is-48x48">
						<img src="img/git.jpg" alt="Placeholder image">
					</figure>
				</div>
				<div class="media-content">
					<p class="title is-4">GitHub</p>
					<p class="subtitle is-6">alstjr7437</p>
				</div>
			</div>
		</div>
	</div>
</a>
```
bulma에서 카드 사용법입니다
[참조](https://bulma.io/documentation/columns/sizes/) <br>

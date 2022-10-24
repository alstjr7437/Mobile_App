# 2학년 2학기 모바일 앱 강의
[운동 소개앱](https://dazzling-genie-bf6e40.netlify.app/%EC%9A%B4%EB%8F%99%20%EC%86%8C%EA%B0%9C%20%EC%95%B1/work-intro.html) <br>
[모바일 포트폴리오](https://dazzling-genie-bf6e40.netlify.app/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/index.html) <br>

# 운동 소개앱

<img src="https://github.com/alstjr7437/Mobile_App/blob/main/%EC%9A%B4%EB%8F%99%20%EC%86%8C%EA%B0%9C%20%EC%95%B1/img/workapp1.JPG" width="300" height="500"><br>

# 모바일 포트폴리오

<img src="https://github.com/alstjr7437/Mobile_App/blob/main/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/img/mportfolio.JPG" width="300" height="500"><br>

## 사용한 framework
[jquery mobile](https://jquerymobile.com/) <br>
[bootstrap](https://getbootstrap.com/) <br>
[uikit](https://getuikit.com/) <br>
[bulma](https://bulma.io/) <br>
[echart](https://echarts.apache.org/en/index.html) <br>



## 페이지별 framework 사용 현황
- index.html
  + jquery mobile
- info.html
  + jquery mobile
  + bulma
- intro.html
  + jquery mobile
  + bootstrap
- career.html
  + jquery mobile
  + echart
- project.html
  + jquery mobile
  + uikit
- project1~8.html
  + jquery mobile

## jquery mobile css 사용
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


## bootstrap 사용
### 각 버튼별 설명 나오기
<img src = "https://github.com/alstjr7437/Mobile_App/blob/main/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/img/bootstrap2.JPG" width="500" height="700">

```html
<p>
	<button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseWidthExample1" aria-expanded="false" aria-controls="collapseWidthExample1">
		누구인가
	</button>
</p>
<div style="min-height: 120px;">
	<div class="collapse collapse-horizontal" id="collapseWidthExample1">
		<div class="card card-body" style="width: 300px;">
			저는 동의과학대학교 컴퓨터정보학과를 재학중인 김민석입니다.
		</div>
	</div>
</div>
<p>
	<button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseWidthExample2" aria-expanded="false" aria-controls="collapseWidthExample2">
		코딩 계기
	</button>
</p>
<div style="min-height: 120px;">
	<div class="collapse collapse-horizontal" id="collapseWidthExample2">
		<div class="card card-body" style="width: 300px;">
			형제들을 보며 코딩을 배우고 대학에 들어와 코딩을 접하여 현재는 계속 흥미를 가지고 코딩중 입니다.
		</div>
	</div>
</div>
```
각 버튼을 클릭하면 해당 문구가 나오는 구조입니다. <br>


## bulma 사용
### 카드 만들기

클릭시 옮겨가는 카드 만들기<br>
<img src="https://github.com/alstjr7437/Mobile_App/blob/main/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/img/bulma2.JPG" width="300" height="200">

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

## uikit 사용
### 스크롤 버튼 만들기

프로젝트들이 많아서 다시 위로 올리기 귀찮을때<br>
Scroll up을 누를시 제일 위로 올라가는 동작 만들기<br>
<img src="https://github.com/alstjr7437/Mobile_App/blob/main/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/img/uikit3.JPG" width="400" height="500">

```html
<a class="uk-button uk-button-primary" href="#target" uk-scroll>Scroll Up</a>
```

## echart 사용
### 언어 능력 확인

echart를 이용한 각 학기별 언어 능력 성장을 확인하기<br>
<img src="https://github.com/alstjr7437/Mobile_App/blob/main/%ED%8F%AC%ED%8A%B8%ED%8F%B4%EB%A6%AC%EC%98%A4%20%EC%95%B1/img/echart2.JPG" width="800" height="800">
```html
<script src="https://fastly.jsdelivr.net/npm/echarts@5.4.0/dist/echarts.min.js"></script>
<div id="container" style="height: 100%;"></div>
<script type="text/javascript">
	var dom = document.getElementById('container');
	var myChart = echarts.init(dom, null, {
		renderer: 'canvas',
		useDirtyRect: false
	});

```

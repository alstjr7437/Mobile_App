//=========================================================================
function gid(id) {return document.getElementById(id);}
//=========================================================================

//localStorage함수들..
//처음 사용자 이름은 공용으로 로그인 안할때 다같이 쓰는 곳
let useName = "공용";
//-------------------------------------------------------------------------
//사용자에 localStorage key값을 주고 todo와 done을 나눠줌
//사용자의 ToDo의 정보 수집
function saveList1(userName) {
    //수집할 정보 빈 객체 생성
    let list = {    //내용과 날짜를 저장하는 배열 생성
        con: [],
        date: [],
        time: []
    }
    let conArray = gid("tbodyToDo").querySelectorAll('#localitem');     //tbody에 id를 준것을 가져오기
    let dateArray = gid("tbodyToDo").querySelectorAll('#localdate');
    let timeArray = gid("tbodyToDo").querySelectorAll('#localtime');

    for(let item of conArray)
        list.con.push(item.innerHTML.replace('<strong>','').replace('</strong>', ''));  //replcae를 이용하여 strong 빼주기
    for(let item of dateArray)
        list.date.push(item.innerHTML.replace('<strong>','').replace('</strong>', ''));
    for(let item of timeArray)
        list.time.push(item.innerHTML.replace('<strong>','').replace('</strong>', ''));
    
    //키 값은 사용자이름+테이블명으로 선언해줘서 유저마다 localStorage에 저장
    localStorage.setItem(userName + "tbodyToDo", JSON.stringify(list));
}
//--------------------------------------------------------------------------
//사용자의 Done의 정보 수집
//위와 같은 형식인데 Done(설명도 위와 같음)
function saveList2(userName) {
    let list = {
        con: [],
        date: [],
        time: []
    }
    let conArray = gid("tbodyDone").querySelectorAll('#localitem');
    let dateArray = gid("tbodyDone").querySelectorAll('#localdate');
    let timeArray = gid("tbodyDone").querySelectorAll('#localtime');

    for(let item of conArray)
        list.con.push(item.innerHTML.replace('<strong>','').replace('</strong>', '')); 
    for(let item of dateArray)
        list.date.push(item.innerHTML.replace('<strong>','').replace('</strong>', ''));
    for(let item of timeArray)
        list.time.push(item.innerHTML.replace('<strong>','').replace('</strong>', ''));
    
    localStorage.setItem(userName + "tbodyDone", JSON.stringify(list));
}
//--------------------------------------------------------------------------
//localStorage에 있는 테이블 불러오는 함수
function readList(){
    //유저이름에 따른 아이템 가져오기 위한 함수
    let doing = localStorage.getItem(`${useName}tbodyToDo`);
    let done = localStorage.getItem(`${useName}tbodyDone`);

    if(doing == null && done == null)
        return;

    let tbodyToDo = JSON.parse(doing);
    let tbodyDone = JSON.parse(done);

    for(let i in tbodyToDo.con){    //for in 반복문을 통하여 localStorage의 값을 가지고 테이블열 생성하기
        appendRow(tbodyToDo.con[i], tbodyToDo.date[i], tbodyToDo.time[i], "tbodyToDo");
    }

    for(let i in tbodyDone.con){
        appendRow(tbodyDone.con[i], tbodyDone.date[i], tbodyDone.time[i], "tbodyDone");
    }
}
//--------------------------------------------------------------------------
//각 테이블 저장하는 함수
function saveTable(){
    saveList1(useName);     //현재 입력되어있는 useName을 이용하여 각 테이블 저장
    saveList2(useName);
}

//=========================================================================
//--------------------------------------------------------------------------
//사용자 계정 저장 함수1
//처음 계정 생성(user를 선언하기 위해)(계속 이것을 쓸시 user가 계속 다시 들어가서 안에 안들어가짐.)
//key값 "계정들"이 없을때 실행되는 함수
function saveUser1(listName) {
    //수집할 정보 빈 객체 생성
    let user = {
        name: [],
        userId: [],
        userPassword: []
    }
    let nameArray = gid(listName).querySelectorAll('#name');
    let IdArray = gid(listName).querySelectorAll('#login');
    let PasswordArray = gid(listName).querySelectorAll('#password');

    for(let item of nameArray){ //for of 반복문으로 이름 배열에 넣기 
        user.name.push(item.value);  
        alert(`${item.value}님 새로운 계정이 만들어졌습니다!!`);    //만들어지면 회원가입이 되었다고 알려주기 위한 코드
    }
    for(let item of IdArray)
        user.userId.push(item.value);
    for(let item of PasswordArray)
        user.userPassword.push(item.value);

    localStorage.setItem("계정들", JSON.stringify(user));   //key값은 계정들
}
//--------------------------------------------------------------------------
//사용자 계정 저장 함수2
//localStorage에 key값 "계정들"이 있을때 실행되는 함수
function saveUser2(listName) {
    let check = localStorage.getItem("계정들"); //key값 계정들 가져오기
    let user = JSON.parse(check);
    //수집할 정보 빈 객체 생성
    let nameArray = gid(listName).querySelectorAll('#name');
    let IdArray = gid(listName).querySelectorAll('#login');
    let PasswordArray = gid(listName).querySelectorAll('#password');

    for(let item of nameArray){
        user.name.push(item.value);  
        alert(`${item.value}님 새로운 계정이 만들어졌습니다!!`);
    }
    for(let item of IdArray)
        user.userId.push(item.value);
    for(let item of PasswordArray)
        user.userPassword.push(item.value);

    localStorage.setItem("계정들", JSON.stringify(user));
}
//--------------------------------------------------------------------------
//--------------------------------------------------------------------------
//로그인 버튼 함수
function login(){
    //localStorage 들고오기!
    let check = localStorage.getItem("계정들");
    let user = JSON.parse(check);

    //아이디 비밀번호 박스 들고오기
    let inputId = gid("login");
    let inputPassword =  gid("password");
    let inputName = gid("name");
    let tbodyToDo = gid("tbodyToDo");
    let tbodyDone = gid("tbodyDone");

    for(let i in user.userId){
        //로그인 성공시
        if(inputId.value == user.userId[i] && inputPassword.value == user.userPassword[i]){
            alert("로그인 성공!");
            console.log("로그인 하였습니다.");
            inputName.value = user.name[i];

            useName = user.name[i];             //계정 로그인 하면 useName이 사용자 이름으로 바뀌도록
            tbodyToDo.innerHTML = "";           //바뀐 useName을 이용하여 개인의 테이블들을 저장
            tbodyDone.innerHTML = "";
            readList();                         //로그인하면 본인의 테이블 불러오기
            return;
        }
        //비밀번호 틀릴시
        else if(inputId.value == user.userId[i] && inputPassword.value != user.userPassword[i]){        
            alert("비밀번호를 다시 입력하세요!");
            console.log("비밀번호 틀림");
            inputPassword.value = "";           //아이디는 맞으므로 두고 비밀번호는 값들을 지워줌

            useName = "공용";
            inputName.value = useName;
            tbodyToDo.innerHTML = "";
            tbodyDone.innerHTML = "";
            readList();                 //실패시 공용 테이블 가져오기
            return;
        }
    }
 
    for(let i in user.userId){
        //아이디 없을시
        if(inputId.value != user.userId[i] && inputPassword.value != user.userPassword[i]) {
            inputId.value = "";
            inputPassword.value = "";           //둘다 틀렸으므로 둘다 지워줌

            useName = "공용";
            inputName.value = useName;
            tbodyToDo.innerHTML = "";
            tbodyDone.innerHTML = "";
            readList();                 //실패시 공용 테이블 가져오기
        }
    }
    console.log("아이디 없음");
    alert("없는 아이디입니다!");        //아이디 없을때는 return을 안하므로 이 문구가 출력됨.
}
//--------------------------------------------------------------------------
//로그아웃 버튼 함수
function logout(){    //아이디 비밀번호 박스 들고오기
    if(useName != "공용"){      //공용이 아닐때만 버튼이 실행 되도록
        //text박스 들고오기
        let inputId = gid("login");
        let inputPassword =  gid("password");
        let inputName = gid("name");

        useName = "공용";
        inputId.value = "";
        inputPassword.value = "";
        inputName.value = useName;
        tbodyToDo.innerHTML = "";
        tbodyDone.innerHTML = "";
        readList();             //공용 테이블 가져오기
        alert("로그아웃");
    }
}
//--------------------------------------------------------------------------
//로그인 엔터키 함수(비밀번호에서만 작동)
function keydownHandler2(){
    if(event.keyCode == 13){
        login();
    }
}
//--------------------------------------------------------------------------
//회원가입 클릭 이벤트를 위한 함수(key값의 유무에 따른 함수 차별을 위해 만든 함수)
function saveLogin(){
    if(useName == "공용"){  //공용일때만 계정을 만들 수 있음
        if(localStorage.getItem("계정들") == null)  //계정들이 없을떄
            saveUser1("divLogin");                  //1번으로 처음 localStorage에 사용자 관리 key값을 만들어줌
        else 
            saveUser2("divLogin");
    }
}
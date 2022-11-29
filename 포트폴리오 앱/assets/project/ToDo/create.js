//=========================================================================
function gid(id) {return document.getElementById(id);}
//=========================================================================

//=========================================================================
//열을 추가하는 함수
function appendRow(newword, date, time, listName) {
    //tbodyToDo를 이용하여 새 행을 생성한다
    let tbody = gid(listName);
    let newRow = tbody.insertRow(order(date,time,tbody));
    //생성된 새 행(newRow)을 이용하여 내부에 두개의 행을 생성한다.
    let cell0 = newRow.insertCell(0);
    let cell1 = newRow.insertCell(1);
    let cell2 = newRow.insertCell(2);
    let cell3 = newRow.insertCell(3);
    let cell4 = newRow.insertCell(4);
    let cell5 = newRow.insertCell(5);

    //날짜 내용 아이디 설정(localStorage 위해서)
    cell2.id = "localdate";
    cell3.id = "localtime";
    cell4.id = "localitem";

    //배경색 설정
    $(newRow).addClass(backColor(date,time));
    setInterval(function() {    //시간이 바뀌면 배경색도 바꾸기 위해 setInterval
        $(newRow).addClass(backColor(date,time));
    }, 1000);
    
    //처음에 들어갈 체크박스를 만든다.
    let check = document.createElement("input");
    check.setAttribute("type", "checkbox");
    //done에 있으면 체크박스 클릭 되있도록
    if(tbody == tbodyDone){
        check.setAttribute("checked", "on");
    }

    //생성된 셀에 필요한 내용을 저장한다.
    cell0.appendChild(check);
    cell1.innerHTML = overTime(date,time);
    setInterval(function(){
        cell1.innerHTML = overTime(date,time);
    }, 1000);
    cell2.innerHTML = "<strong>" + date + "</strong>";
    cell3.innerHTML = "<strong>" + time + "</strong>"; 
    cell4.innerHTML = "<Strong>" + newword + "</Strong>";
    cell5.innerHTML = "<Strong>" + "삭제" + "</Strong>";
    //생성된 셀에 필요한 이벤트 핸들러를 저장한다.
    $(check).click(btnFinishHandler);
    $(cell5).click(btnDeleteHandler);
    //테이블 생성 동작할때 마다 저장
    saveTable();
}
//==========================================================================
//--------------------------------------------------------------------------
//엔터를 누르면 입력이 되는 함수
function keydownHandler(){
    if(event.keyCode == 13){ //Enter key를 눌렀으면... 
        let date = gid("idate");
        let time = gid("itime");
        this.value = this.value.trim(); //아무것도 없거나 스페이스바 방지
        if(this.value.length == 0) {
            return;
        }
        appendRow(this.value, date.value, time.value, "tbodyToDo");  //열 만들기
        this.value = "";        //엔터치고 비우기
    }
} 
//--------------------------------------------------------------------------
//완료버튼을 누르면 입력이 되도록 하는 함수
function finishHandler(){
    let newItem = gid("newItem");
    let date = gid("idate");
    let time = gid("itime");
    newItem.value = newItem.value.trim();
        if(newItem.value.length == 0) {    //스페이스바로 비워져있으면
            return;
        }
        appendRow(newItem.value, date.value, time.value, "tbodyToDo");  //안에 넣기
        newItem.value = "";        //엔터치고 비우기
}
//==========================================================================
//--------------------------------------------------------------------------
//click한 버튼을 포함하는 객체(버튼의 부모노드)를 삭제한다.
function btnDeleteHandler(){
    $(this.parentNode).remove(); 
    saveTable();    //삭제할때 localStorage도 같이 삭제되도록
}
//--------------------------------------------------------------------------
// 클릭한 span 객체를 listDone 객체의 자식노드로 보낸다.(연결한다)
function btnFinishHandler(){
    let parentId = this.parentNode.parentNode.parentNode;

    let trArray;
    let tr = this.parentNode.parentNode;
    let date = tr.children[2].innerHTML.slice(8,18);
    let time = tr.children[3].innerHTML.slice(8.13);

    if(parentId.getAttribute('id') == "tbodyToDo"){
        parentId = document.getElementById("tbodyDone");
        trArray = parentId.children;
    } else {
        parentId = document.getElementById("tbodyToDo");
        trArray = parentId.children;
    } 

    parentId.insertBefore(tr, trArray[order(date, time, parentId)]);
    saveTable();        //옮길때 같이 localStorage도 옮겨지도록
}

//--------------------------------------------------------------------------

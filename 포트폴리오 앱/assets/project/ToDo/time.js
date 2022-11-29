//=========================================================================
function gid(id) {return document.getElementById(id);}
//==========================================================================
//--------------------------------------------------------------------------
//현재시간을 보여주기 위한 함수
function setTime(){
    let ntime = new Date();

    let print = "";
    print += ntime.getFullYear() + "년 ";
    print += ntime.getMonth() + 1 + "월 ";
    print += ntime.getDate() + "일 <br>";
    if(ntime.getHours()>12){      //시간이 12보다 크다면 오후 아니면 오전
        print += "오후 ";
        print += ntime.getHours()-12+"시 ";
    } else {
        print += "오전 ";
        print += ntime.getHours()+"시 ";
    }
    print += ntime.getMinutes()+"분 ";
    print += ntime.getSeconds()+"초";
    
    document.all.divClock.innerHTML = print;
}

//-------------------------------------------------------------------------
//지난시간 표시하는 함수
function overTime(date, time){
    let setDate = new Date(`${date}T${time}:00+0900`);  //초는 자동으로 00설정 
    let now = new Date();
    
    let distance = setDate.getTime() - now.getTime();
    let day, hours, minutes, title;
    
    if (distance <= 0)  {       //목표시간이 지났을때 글씨색을 바꾸는 코드(지나면 -가 되므로 거꾸로 빼주기)
        distance = now.getTime() - setDate.getTime(); 
        title = "<strong id = later>"
    }
    else {
        title = "<strong>"
    }
    //날짜들 계산하는 코드
    day = Math.floor(distance/(1000*60*60*24));
    hours = Math.floor((distance % (1000*60*60*24))/(1000*60*60));
    minutes = Math.floor((distance % (1000*60*60))/(1000*60));
    second = Math.floor((distance % (1000*60) / 1000));

    if(day == 0){
        title += `${hours < 10 ? `0${hours}` : hours}:${minutes < 10 ? `0${minutes}` : minutes}:${second < 10 ? `0${second}` : second}</strong>`;
    }
    else {
        title += ` ${day}일 ${hours < 10 ? `0${hours}` : hours}:${minutes < 10 ? `0${minutes}` : minutes}:${second < 10 ? `0${second}` : second}</strong>`;
    }    
    return title;
}


//-------------------------------------------------------------------------
//시간별로 순서대로 테이블에 들어가도록 하는 함수
function order(date, time, table){
    let inputTime, tableTime;
    let row = table.children;           //tbody의 자식가져오기
    let trData1 = [];                   //table에 있는 날짜 저장하는 배열
    let trData2 = [];                   //table에 있는 시간 저장하는 배열 
    let rowIndex = 0;                   //table 줄 번호를 위한 변수

    let year = date.slice(0,4);         //slice로 잘라줘서 각자의 날짜및 시간 들고옴
    let month = date.slice(5,7);
    let day = date.slice(8,10);
    let hour = time.slice(0,2);
    let minutes = time.slice(3,5);
    inputTime = new Date(year,month-1,day,hour,minutes);        //입력받은 값을 이용해 날짜 만들기 

    //table에 있는 시간들 들고오기 위한 반복문
    for(let tr of row){
        trData1.push(tr.children[2].innerHTML);
        trData2.push(tr.children[3].innerHTML);
    } 
    for(let i=0; i<row.length; i++){
        year = trData1[i].slice(8,12);          //strong빼고 잘라주기 위해서 slice
        month = trData1[i].slice(13,15);
        day = trData1[i].slice(16,18);
        hour = trData2[i].slice(8,10);
        minutes = trData2[i].slice(11,13);
        tableTime = new Date(year,month-1,day,hour,minutes);        //테이블에 있는 값을 이용해 날짜 만들기 
        
        if(tableTime > inputTime){  //table타임이 더크면 그자리에 들어감
            rowIndex = i;
            break;
        }
        else {
            rowIndex = i + 1;       //들어가는 시간이 더크면 뒤에 들어감
        }
    }
    return rowIndex;
}

//-------------------------------------------------------------------------
//시간별로 테두리 색이 달라지는 함수
function backColor(date, time) {
    let setDate = new Date(`${date}T${time}:00+0900`)       //날짜와 시간가져와서 새로운 날짜 만들기
    let now = new Date();                                   //현재날짜 들고오기
    
    let distance = setDate.getTime() - now.getTime();
    let day, hours, minutes, backNum;

    day = Math.floor(distance/(1000*60*60*24));
    hours = Math.floor((distance % (1000*60*60*24))/(1000*60*60));
    minutes = Math.floor((distance % (1000*60*60))/(1000*60));
    second = Math.floor((distance % (1000*60) / 1000));

    //남은시간을 계산해서 if문으로 자동으로 색이 변경되는 코드
    if(setDate.getTime() < now.getTime()){
        backNum = "table-dark";
    } else {4
        if(day < 365) {
            backNum = "table-danger";
            if(day < 30) {
                backNum = "table-light";
                if(day < 7) {
                    backNum = "table-info";
                    if(day < 1) {
                        backNum = "table-primary";
                        if(day < 1 && hours < 12) {
                            backNum = "table-success";
                            if (day < 1 && hours < 3) {
                                backNum = "table-warning";
                                if (day < 1 && hours < 1) {
                                    backNum = "table-danger";
                                }
                            }
                        }
                    }
                }
            }
        } 
    }
    return backNum;
}

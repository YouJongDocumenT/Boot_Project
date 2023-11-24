const ckBoxQuery = "input[name='elementCk']";

function allElementCk(ckBox){
    const isCk = ckBox.checked;

    // 전체 체크박스 체크여부 토글 적용
    const ckBoxes = document.querySelectorAll(ckBoxQuery);
    for (let i = 0; i < ckBoxes.length; i++) {
        ckBoxes[i].checked = isCk;
    }
}

function removeElement(key) {
    const ckBoxes = document.querySelectorAll(ckBoxQuery + ":checked");
    if(ckBoxes.length == 0)
        return;

    const isRemove = confirm("정말로 삭제하시겠습니까?");
    if(isRemove){
        const productArr = [];
        for (let i = 0; i < ckBoxes.length; i++) {
            let obj = {};
            obj[key] = ckBoxes[i].dataset['elementid'];
            productArr.push(obj);
        }

        $.ajax({
        	url : "http://localhost:8090/IOmanage/deletemanage",
        	type : 'POST',
        	traditional : true,
        	data : {
        		productArr : productArr
        	},
        	success: function(data){
        		if(data == YES){
        			alert("성공");
        		}else{
        			alert("실패");
        		}
        	}
        })
    }

}
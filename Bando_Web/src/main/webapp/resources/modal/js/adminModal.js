// 회원 정보를 토대로 모달 입력창 초기화
function initMemberEdit(duct){
    const Product = duct[0];
    const purchasecomp = duct[1];
    const reposibility = duct[2];
    const pweight = duct[3];
    const plength = duct[4];
    const quantity = duct[5];
    const pchprice = duct[6];
    const price = duct[7];
    const tax = duct[8];
    const difference = duct[9];

    document.querySelector("#addProduct").value = Product;
    document.querySelector("#addpurchasecomp").value = purchasecomp;
    document.querySelector("#addReposibility").value = reposibility;
    document.querySelector("#addPweight").value = pweight;
    document.querySelector("#addPlength").value = plength;
    document.querySelector("#addQuantity").value = quantity;
    document.querySelector("#addPchprice").value = pchprice;
    document.querySelector("#addPrice").value = price;
    document.querySelector("#addTax").value = tax;
    document.querySelector("#addDifference").value = difference;
}

function addProductList(){
    const formData = $("#ProductAddLabelForm").serialize();

    Swal.fire({
        title: '재고 추가',
        text: "정말로 추가 하시겠습니까?",
        icon: 'info',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: '승인',
        cancelButtonText: '취소',
        reverseButtons: false, // 버튼 순서 거꾸로

    }).then(result => {

        if(result.isConfirmed){
            $.ajax({
                url: "http://localhost:8090/IOmanage/write",
                type: "POST",
                data: formData, // 직렬화한 폼 데이터를 전송
                success: function (data) {
                    if (data.trim()==='YES') {
                        updateSuccess(result);
                    } else {
                        Swal.fire('실패!', '빈칸이 있는지 확인해주세요.', 'error');
                    }
                },error: function () {
                    Swal.fire('에러 발생', '서버 오류가 발생했습니다.', 'error');
                }
            });
        }

    }) // end Swal
}

function updateSuccess(result){
    Swal.fire(
        'success',
        '추가 완료되었습니다.',
        'success'
    ).then(function(){
        location.href = location.href;
    })
}
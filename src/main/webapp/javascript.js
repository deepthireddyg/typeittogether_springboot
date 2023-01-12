function postData() {
  //Submit Request
console.log("hello world");
  var documentTitle = document.getElementById("documentTitle").value;
  var createDate = document.getElementById("createDate").value;
  var lastModified = document.getElementById("lastModified").value;
  var documentText = document.getElementById("documentText").value;
  var lastModifiedBy = document.getElementById("lastModifiedBy").value;
  var documentLocation = document.getElementById("documentLocation").value;
  var docPermission = document.getElementById("docPermission").value;





  let data =
    '{"documentTitle": "' +
    documentTitle +
    '", "createDate": "' +
    createDate +
    '", "lastModified": "' +
    lastModified +
    '", "documentText": "' +
    documentText +
    '", "lastModifiedBy": "' +
    lastModifiedBy +
    '", "documentLocation": "' +
    documentLocation +
    '", "docPermission": "' +
    docPermission +
    '"}';

  console.log(data);



  const myurl = "http://localhost:8080/docsubmission";

  const Http = new XMLHttpRequest();

  const url = myurl;
  Http.open("POST", url);

  Http.setRequestHeader("Accept", "application/json");
  Http.setRequestHeader("Content-Type", "application/json");

  Http.send(data);

  Http.onreadystatechange = (e) => {
    console.log(Http.responseText);
    const obj = JSON.parse(Http.responseText);
    console.log(obj);
    alert(Http.responseText);
    document.getElementById("submissionformid").reset();
  };

}

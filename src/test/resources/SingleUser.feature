Feature: Single User Api Testing

  Scenario: Validation of Single user
    Given url "https://reqres.in/api/users/2"
    When method get
    Then status 200
    * match $ =={"data": {"id": 2,"email": "janet.weaver@reqres.in","first_name": "Janet","last_name": "Weaver","avatar": "https://reqres.in/img/faces/2-image.jpg"},"support": {"url": "https://reqres.in/#support-heading","text": "To keep ReqRes free, contributions towards server costs are appreciated!"}}
    * assert response.data.email == 'janet.weaver@reqres.in'
    * assert responseStatus == 200
    * assert responseTime < 400
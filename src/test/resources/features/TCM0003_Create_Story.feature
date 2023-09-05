Feature: Story
  As a user
  I want to Create Story
  Scenario: TCM0003 Create Story
    Given I am on the login page
    When I click Masuk
    And I click button masuk dengan google
    And I select account google
    And I click no thank and I click Okay
    Then successfully logged in I am now on the home page
    When I click button buat
    And I click Cerita Memasak
    And I click unggah foto story
    And I click foto
    And I click Allow for access photos
    And I click burger menu
    And I click Download
    And I select Image
    And I set tambahkan judul
    And I Set Tulis Postingan
    And I click button tandai tantangan
    And I select cookandshare
    Then I click button bagikan
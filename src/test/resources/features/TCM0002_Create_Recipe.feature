Feature: Create Recipe
  As a user
  I want to Create Recipe
  Scenario: TCM0002 Create Recipe
    Given successfully logged in I am now on the home page
    When I click button buat
    And I click unggah recipe
    And I click upload foto
    And I click foto
    And I click Allow for access photos
    And I click burger menu
    And I click Download
    And I select Image
    And I set judul recipe
    And I set descriptions recipe
    And I set ingredients
    And I set langkah-langkah
    And I set waktu memasak
    And I set kategori
    And I click button Lanjut
    And I click pratinjau
    And I click unggah resep
    Then I successfully created a recipe
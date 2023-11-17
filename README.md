# Android-TD2-3GII-SSE-

Author:Manai Mortadha

----


# Exercise 3: Person List App

This application provides an interface with the following features:

- Displaying a list of people
- Adding a person to the list using the "Add" button
- Opening a dialog box upon clicking an item to update a person's information

## Interface Description

The interface consists of:
- A list view displaying people's information.
- An "Add" button that allows users to add a new person to the list.
- Clicking on an item in the list opens a dialog box to update the person's information.

## Implementation Details

- **MainActivity.java**: Manages the list view and handles interactions.
- **Person.java**: Represents a Person object with attributes such as name, email, etc.
- **PersonAdapter.java**: Manages the RecyclerView and binds data.
- **ListItemLayout.xml**: Layout for displaying a person's information in the list.
- **DialogLayout.xml**: Layout for the dialog box to update person's information.

## Functionality

- The "Add" button adds a new person to the list.
- Clicking on an item in the list opens a dialog box to update that person's information.

## How to Use

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or a physical device.
4. The app will display a list of people.
5. Click on the "Add" button to add a new person.
6. Click on an existing person in the list to update their information using the dialog box.

## Customization

- To modify the displayed information or add more fields, update the `Person` class and corresponding layouts.

## Notes

- Error handling, validation, and other enhancements can be added for a more robust application.
- This README provides an overview; refer to the code for detailed implementation.

---

# Exercise 4: Country List App

This application demonstrates a simple implementation of displaying a list of countries using a RecyclerView. Each item in the list consists of the country's name and an image representing a famous monument or landmark from that country. Clicking on an item displays a toast message indicating the selected country.

## Features

- Displays a list of countries with their names and corresponding images.
- Uses RecyclerView to efficiently manage and display the list of countries.
- Allows users to interact by clicking on a country item to view a toast message.

## Implementation Details

- `CountryAdapter.java`: Manages the RecyclerView and binds data to the list items. It inflates the layout for each country item and handles item click events to display a toast message.
- `Country.java`: Represents a Country object with attributes such as name and image resource.
- `MainActivity.java`: Sets up the RecyclerView and populates it with a list of countries. Demonstrates the usage of the `CountryAdapter` to display the data.

## How to Use

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or a physical device.
4. Upon launch, the app will display a list of countries.
5. Click on any country item to view a toast message with the selected country's name.

## Customization

- To add more countries or change the displayed images, modify the `getCountryList()` method in `MainActivity.java` by adding new `Country` objects with their respective names and image resources.
- Adjust the layout in `item_country.xml` to customize the appearance of each country item in the list.

## Screenshots

- Include screenshots or GIFs showcasing the app's functionality and appearance.

## Notes

- Additional notes or considerations about the implementation or specific details can be added here.



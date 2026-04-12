# Practical 10 - JavaFX GUI Programming Guide

## Overview

This practical set focuses on **JavaFX**, a modern Java framework for building graphical user interfaces. All programs in this practical require JavaFX SDK to be installed.

---

## Prerequisites

### JavaFX Installation

JavaFX SDK 21.0.2 should be installed at: `C:\Users\name\javafx-sdk-21.0.2`

### Compilation Command

```powershell
javac --module-path "C:\Users\name\javafx-sdk-21.0.2\lib" --add-modules javafx.controls OOPs/codes/Practical_10_X.java
```

### Execution Command

```powershell
java --module-path "C:\Users\name\javafx-sdk-21.0.2\lib" --add-modules javafx.controls -cp . OOPs.codes.Practical_10_X
```

---

## Practical 10.1: Styled Text with Random Color & Opacity

### Objective

Display 5 text nodes vertically with random colors and opacity levels.

### Key Features

- **5 Text Nodes**: Labeled "Text 1" through "Text 5"
- **Font Styling**: Times New Roman, Bold + Italic, Size 22
- **Random Color**: Each text has a different color (RGB)
- **Random Opacity**: Values between 0.3 and 1.0
- **Layout**: Centered vertically using VBox with 15px spacing

### Important Classes & Methods

| Class         | Method/Property                         | Purpose                                |
| ------------- | --------------------------------------- | -------------------------------------- |
| `Text`        | `setFont()`                             | Set font family, weight, posture, size |
| `Font.font()` | `FontWeight.BOLD`, `FontPosture.ITALIC` | Font styling options                   |
| `Color`       | `Color.color(r, g, b)`                  | Create RGB color (0.0-1.0)             |
| `Text`        | `setFill()`, `setOpacity()`             | Set color and transparency             |
| `VBox`        | `setAlignment(Pos.CENTER)`              | Center content                         |

### Key Code Snippet

```java
Text text = new Text("Text " + i);
text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

Color color = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
double opacity = 0.3 + (rand.nextDouble() * 0.7);

text.setFill(color);
text.setOpacity(opacity);
```

### Output

A window displaying 5 centered text elements with varying colors and transparency levels.

---

## Practical 10.2: Bouncing Ball with Controls

### Objective

Create an animated circle that moves horizontally with Start/Stop controls and speed adjustment.

### Key Features

- **Animated Circle**: Blue ball that bounces horizontally
- **Start/Stop Buttons**: Control animation state
- **Speed Slider**: Adjust ball velocity (range 1-10)
- **Boundary Detection**: Ball bounces at window edges
- **Responsive**: Animation updates based on slider value

### Important Classes & Methods

| Class            | Method/Property                | Purpose                  |
| ---------------- | ------------------------------ | ------------------------ |
| `Circle`         | `setCenterX()`, `setCenterY()` | Set position             |
| `AnimationTimer` | `handle(long now)`             | Animation loop           |
| `Slider`         | `getValue()`                   | Get current slider value |
| `Button`         | `setOnAction()`                | Handle button clicks     |
| `BorderPane`     | `setCenter()`, `setBottom()`   | Layout positioning       |

### Key Code Snippet

```java
AnimationTimer timer = new AnimationTimer() {
    @Override
    public void handle(long now) {
        if (!running) return;

        dx = slider.getValue();
        ball.setCenterX(ball.getCenterX() + dx);

        // Boundary check
        if (x + radius >= width || x - radius <= 0) {
            dx = -dx;
        }
    }
};
```

### Controls

- **Start Button**: Begins animation
- **Stop Button**: Pauses animation
- **Speed Slider**: Controls movement speed (1-10 pixels/frame)

### Output

A window with a bouncing blue circle and control buttons at the bottom.

---

## Practical 10.3: Registration Form with Validation

### Objective

Create a registration form with input validation and file saving capabilities.

### Key Features

- **Form Fields**:
  - Roll No (TextField) → must be integer
  - Name (TextField) → any text
  - Age (TextField) → must be integer
  - Email (TextField) → must contain @ and .

- **Validation Rules**:
  - Roll No: Numeric only
  - Age: Numeric only
  - Email: Must have @ symbol AND dot (.)

- **On Success**:
  - Show confirmation alert with entered data
  - Open FileChooser to save data

- **On Error**:
  - Show error alert with validation message

### Important Classes & Methods

| Class            | Method/Property               | Purpose           |
| ---------------- | ----------------------------- | ----------------- |
| `GridPane`       | `add(node, col, row)`         | Grid-based layout |
| `TextField`      | `getText()`                   | Get user input    |
| `Alert`          | `AlertType.INFORMATION/ERROR` | Show dialog boxes |
| `FileChooser`    | `showSaveDialog()`            | File save dialog  |
| `BufferedWriter` | `write()`, `newLine()`        | Write to file     |

### Validation Logic

```java
try {
    int roll = Integer.parseInt(rollField.getText());
    int age = Integer.parseInt(ageField.getText());
    String email = emailField.getText();

    // Email validation
    if (!email.contains("@") || !email.contains(".")) {
        throw new Exception("Invalid Email format");
    }

    // Success handling...
} catch (NumberFormatException ex) {
    // Show rollNo/age error
} catch (Exception ex) {
    // Show validation error
}
```

### Output

A registration form window where users can:

1. Enter their details
2. Click Submit
3. See validation results (success or error alerts)
4. Save data to a file if successful

---

## Practical 10.4: Bar Chart using Rectangles

### Objective

Display a grade distribution bar chart using Rectangle shapes with proportional heights.

### Key Features

- **Grade Distribution**:
  - Projects: 20% (Red)
  - Quizzes: 10% (Blue)
  - Midterm: 30% (Green)
  - Final: 40% (Orange)

- **Visual Elements**:
  - Bars proportional to height (max 200px for 100%)
  - Color-coded rectangles
  - Labels showing percentage below each bar
  - Centered layout using HBox

### Important Classes & Methods

| Class       | Method/Property            | Purpose                 |
| ----------- | -------------------------- | ----------------------- |
| `Rectangle` | `Rectangle(width, height)` | Create rectangle shape  |
| `Rectangle` | `setFill()`                | Set fill color          |
| `VBox`      | Layout for bar + label     | Vertical stacking       |
| `HBox`      | Layout for multiple bars   | Horizontal arrangement  |
| `Label`     | Display text label         | Category and percentage |

### Key Code Snippet

```java
private VBox createBar(String labelText, int percentage, Color color) {
    double maxHeight = 200;
    double height = (percentage / 100.0) * maxHeight;

    Rectangle bar = new Rectangle(50, height);
    bar.setFill(color);

    Label label = new Label(labelText + " — " + percentage + "%");

    VBox box = new VBox(10);
    box.setAlignment(Pos.BOTTOM_CENTER);
    box.getChildren().addAll(bar, label);

    return box;
}
```

### Output

A window displaying 4 colored bars representing grade distribution percentages, arranged horizontally with labels.

---

## Common Issues & Solutions

### Issue: "Could not find or load main class"

**Solution**: Run from the correct directory and use full package name

```powershell
cd C:\Users\name\Desktop\GTU_SEM_4
java --module-path ... -cp . OOPs.codes.Practical_10_X
```

### Issue: Module not found (javafx.controls)

**Solution**: Verify JavaFX path and use `--add-modules javafx.controls` flag

### Issue: JavaFX window appears but nothing displays

**Solution**: Check that `stage.show()` is called at the end of `start()` method

### Issue: Animation not working (Practical 10.2)

**Solution**: Ensure `timer.start()` is called and button actions properly set `running` flag

### Issue: File not saving (Practical 10.3)

**Solution**: Check file permissions and ensure FileChooser dialog is properly handled

---

## Quick Reference: JavaFX Modules

For different requirements, use appropriate modules:

| Requirement                  | Module            |
| ---------------------------- | ----------------- |
| Basic controls, text, shapes | `javafx.controls` |
| FXML layout                  | `javafx.fxml`     |
| Graphics, 3D                 | `javafx.graphics` |
| Web content                  | `javafx.web`      |
| Media playback               | `javafx.media`    |

---

## Execution Summary

| Program | Purpose            | Key Topic                            |
| ------- | ------------------ | ------------------------------------ |
| 10.1    | Text styling       | Font, Color, Styling                 |
| 10.2    | Animation          | AnimationTimer, Event Handling       |
| 10.3    | Input validation   | Forms, Validation, File I/O          |
| 10.4    | Data visualization | Shapes, Layout, Proportional Drawing |

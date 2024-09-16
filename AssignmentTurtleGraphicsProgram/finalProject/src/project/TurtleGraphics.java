package project;

import java.awt.FlowLayout;
import uk.ac.leedsbeckett.oop.OOPGraphics;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TurtleGraphics extends OOPGraphics {
    private BufferedImage currentImage;
    private String commands;
    private JFileChooser selector = new JFileChooser();
    private boolean save = false;

    public TurtleGraphics() {
        JFrame mainFrame = new JFrame();                
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainFrame.setLayout(new FlowLayout());  
        mainFrame.add(this);                                    
        mainFrame.pack();                                       
        mainFrame.setVisible(true);  
        super.about();
    }

    public void backward(int distance) {
        // Get the current position of the turtle
        int currentX = getxPos();
        int currentY = getyPos();
        
        // Get the current direction of the turtle
        int currentDirection = getDirection();

        // Calculate the change in x and y positions based on the current direction
        double deltaX = distance * Math.sin(Math.toRadians(currentDirection));
        double deltaY = distance * Math.cos(Math.toRadians(currentDirection));

        // Calculate the new position after moving backward
        int newX = currentX; // X position remains the same for backward movement
        int newY = (int) Math.round(currentY - deltaX); // Subtract deltaY for backward movement

        // Move the turtle to the new position
        setxPos(newX);
        setyPos(newY);

        // Repaint the panel to update the display
        repaint();
    }






    private enum Command {
        ABOUT, PENUP, PENDOWN, TURNLEFT, TURNRIGHT, FORWARD, BACKWARD, BLACK, GREEN, RED, WHITE, RESET, CLEAR, SAVE, LOAD, SQUARE, PENCOLOUR, PENWIDTH, ETRIANGLE, TRIANGLE
    }


    private boolean isValidCommand(String command) {
        try {
            Command.valueOf(command.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public void saveImage() {
        selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        selector.setDialogTitle("Save a File");
        int state = selector.showSaveDialog(null);
        if (state != JFileChooser.APPROVE_OPTION) {
            displayMessage("Try Again!");
        } else {
            try {
                File outputFile = selector.getSelectedFile();
                // Check if the file name ends with ".png", if not, append ".png" to it
                if (!outputFile.getName().toLowerCase().endsWith(".png")) {
                    outputFile = new File(outputFile.getPath() + ".png");
                }
                ImageIO.write(getBufferedImage(), "png", outputFile);
                save = true;
            } catch (IOException e) {
                // Handle the exception, e.g., display an error message
            }
        }
    }

    public void loadImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG files", "png")); // Filter to only show PNG files
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                currentImage = ImageIO.read(file);
                if (currentImage != null) {
                    repaint(); // Repaint the panel to display the loaded image
                } else {
                    displayMessage("Failed to load the image.");
                }
            } catch (IOException ex) {
                displayMessage("Error loading the image: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public void saveCommands() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println(commands);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void loadCommands() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    processCommand(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
	public void about() {
		clear();
    	turnLeft();
		turnRight(180);
		forward(200);
		penDown();
		setPenColour(Color.red);
		forward(50);
		turnLeft();
		forward(50);
		turnLeft();
		forward(50);
		turnRight();
		forward(50);
		turnRight();
		forward(50);
		reset();
		
		turnRight();
		forward(150);
		turnLeft();
		penDown();
		setPenColour(Color.green);
		forward(100);
		turnLeft();
		forward(50);
		turnLeft();
		forward(100);
		reset();
		
		turnRight();
		forward(50);
		turnLeft();
		setPenColour(Color.blue);
		penDown();
		forward(100);
		turnLeft();
		forward(50);
		turnLeft();
		forward(50);
		turnLeft();
		forward(50);
		turnRight();
		forward(50);
		turnRight();
		forward(50);
		turnRight();
		forward(50);
		reset();
		
		turnLeft();
		forward(50);
		turnRight();
		penDown();
		setPenColour(Color.white);
		forward(100);
		turnRight(180);
		forward(100);
		turnRight();
		forward(50);
		turnRight();
		forward(50);
		turnRight();
		forward(50);
		turnRight(270);
		turnLeft(45);
		forward(70);
		reset();
		
		turnLeft();
		forward(160);
		turnRight(65);
		penDown();
		setPenColour(Color.red);
		forward(100);
		turnRight(180);
		forward(100);
		turnLeft();
		turnLeft(35);
		forward(100);
		turnLeft(180);
		forward(50);
		turnRight(65);
		forward(55);
		reset();
		
		turnLeft();
		forward(260);
		turnRight();
		penDown();
		setPenColour(Color.green);
		forward(100);
		turnRight(180);
		forward(100);
		turnLeft();
		forward(50);
		turnRight(180);
		forward(100);
		reset();	
	}

    public void drawSquare(int length) {
        for (int i = 0; i < 4; i++) {
            forward(length);
            turnLeft(90); // Corrected: Turning left to form a square
        }
    }


    public void setPenColour(int red, int green, int blue) {
        setPenColour(new Color(red, green, blue));
    }

    public void penWidth(int width) {

		setStroke(width);

		}


    public void drawEquilateralTriangle(int size) {
        for (int i = 0; i < 3; i++) {
            forward(size);
            turnLeft(120);
        }
    }
    public void drawTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Check if the sides form a valid triangle
            double angleA = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2.0 * side2 * side3)));
            double angleB = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2.0 * side1 * side3)));
            double angleC = 180 - angleA - angleB;

            // Draw the triangle
            forward(side1);
            turnLeft(180 - (int) angleA);
            forward(side2);
            turnLeft(180 - (int) angleB);
            forward(side3);
        } else {
            displayMessage("Invalid triangle sides: Not a triangle");
        }
    }


    public void processCommand(String command) {
        if (command.trim().equalsIgnoreCase("about")) {
            about(); 
        } else {
        }
       
        String[] tokens = command.trim().split("\\s+");
        
        // Validating Commands
        
        // Check if the command is valid
        if (!isValidCommand(tokens[0])) {
            displayMessage("Invalid command: " + command);
            return;
        }

        // Check if the command requires a parameter and if it's missing
        if (("forward".equals(tokens[0]) || "backward".equals(tokens[0])) && tokens.length < 2) {
            displayMessage("Missing parameter for command: " + tokens[0]);
            return;
        }

        // Check if the parameter is numeric
        if (("forward".equals(tokens[0]) || "backward".equals(tokens[0])) && !tokens[1].matches("-?\\d+(\\.\\d+)?")) {
            displayMessage("Non-numeric parameter for command: " + tokens[0]);
            return;
        }

        // Convert parameter to integer
        int parameter = 0;
        if (("forward".equals(tokens[0]) || "backward".equals(tokens[0]))) {
            parameter = Integer.parseInt(tokens[1]);
        }

        // Check parameter bounds for specific commands
        if (("forward".equals(tokens[0]) || "backward".equals(tokens[0])) && parameter < 0) {
            displayMessage("Parameter out of bounds for command: " + tokens[0]);
            return;
        }
        
        // Execute the command
        switch (tokens[0]) {
        case "penup":
            penUp();
            break;
        case "pendown":
            penDown();
            break;
        case "turnleft":
            if (tokens.length > 1) {
                turnLeft(Integer.parseInt(tokens[1]));
            } else {
                turnLeft();
            }
            break;
        case "square":
            if (tokens.length > 1) {
                drawSquare(Integer.parseInt(tokens[1]));
            } else {
                displayMessage("Invalid command: square requires a length parameter.");
            }
            break;
        case "turnright":
            if (tokens.length > 1) {
                turnRight(Integer.parseInt(tokens[1]));
            } else {
                turnRight();
            }
            break;
        case "forward":
            if (tokens.length > 1) {
                forward(Integer.parseInt(tokens[1]));
            } else {
                displayMessage("Invalid command: forward requires a distance parameter.");
            }
            break;
        case "backward":
            if (tokens.length > 1) {
                backward(Integer.parseInt(tokens[1]));
            } else {
                displayMessage("Invalid command: backward requires a distance parameter.");
            }
            break;
        case "black":
            setPenColour(Color.BLACK);
            break;
        case "green":
            setPenColour(Color.GREEN);
            break;
        case "red":
            setPenColour(Color.RED);
            break;
        case "white":
            setPenColour(Color.WHITE);
            break;
        case "reset":
            reset();
            break;
        case "clear":
            clear();
            break;
        case "about":
            break;
        case "save": 
            saveImage();
            break;
        case "load": 
            loadImage();
            break;
        case "pencolour":
            if (tokens.length > 1) {
                String[] colors = tokens[1].split(",");
                if (colors.length == 3) {
                    setPenColour(Integer.parseInt(colors[0]), Integer.parseInt(colors[1]), Integer.parseInt(colors[2]));
                } else {
                    displayMessage("Invalid command: pencolour requires three parameters (red, green, blue).");
                }
            } else {
                displayMessage("Invalid command: pencolour requires three parameters (red, green, blue).");
            }
            break;
        case "penwidth":
            if (tokens.length > 1) {
                penWidth(Integer.parseInt(tokens[1]));
            } else {
                displayMessage("Invalid command: penwidth requires a width parameter.");
            }
            break;
        case "etriangle":
            if (tokens.length > 1) {
                drawEquilateralTriangle(Integer.parseInt(tokens[1]));
            } else {
                displayMessage("Invalid command: equilateral triangle requires a size parameter.");
            }
            break;
        case "triangle":
            if (tokens.length > 3) {
                drawTriangle(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
            } else {
                displayMessage("Invalid command: triangle requires three parameters (side1, side2, side3).");
            }
            break;

    }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentImage != null) {
            g.drawImage(currentImage, 0, 0, null);
        }
    }
}


# Piece Movement Rules and Symbols
Provided to you are a list of Java expressions that depend on:
- destX : the x-coordinate of the cell to move to
- destY : the y-coordinate of the cell to move to
- this.x : the x coordinate of the piece to move
- this.y : the y coordinate of the piece to move

In order to implement your own logic, you can also use this variable in your methods:
- board : the board on which the piece is moving

You are intended to use these expressions to implement canMove for the Piece class. You are intended to use the symbols in the getSymbol method. 
## King
```java
(Math.abs(this.x - destX) <= 1 && Math.abs(this.y  - destY) <=1)
```
*Note: The filled symbols are used to represent black in this assignment*

Symbols: "♚" : "♔"
## Queen
```java
(Math.abs(this.x - destX) == Math.abs(this.y  - destY)) || (this.x == destX || this.y == destY)
```
Symbols: "♛" : "♕"

[//]: 
## Rook
```java
(this.x == destX || this.y == destY)
```
Symbols: "♜" : "♖"
## Bishop
```java
(Math.abs(this.x - destX) == Math.abs(this.y  - destY))
```
Symbols: "♝" : "♗"
## Knight
**Note:** For the knight, you are responsible for implementing the rule that they can hop over other pieces.
```java
(Math.abs(this.x - destX) == 2 && Math.abs(this.y  - destY) == 1) || (Math.abs(this.x - destX) == 1 && Math.abs(this.y  - destY) == 2)
```
Symbols: "♞" : "♘"
## Pawn
**Note:** For the pawn, you are responsible for implementing the rule that they can move 2 blocks forward when it is their first move.
To check if it's a first move, you can simply check if the pawn is still on its starting square. 
Please see the PDF for a complete description of the pawn's movement rules.

Symbols: "♟" : "♙"

# Tips & Tricks

You can use the ternary expression to pick a symbol based on the side of the piece IE:
```java
this.side == Side.WHITE ? '♔' : '♚'
```


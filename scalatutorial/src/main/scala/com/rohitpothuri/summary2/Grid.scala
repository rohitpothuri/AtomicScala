package com.rohitpothuri.summary2

class Grid {
  var cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )

  def clearCells = {
    cells = Vector(
      Vector(new Cell, new Cell, new Cell),
      Vector(new Cell, new Cell, new Cell),
      Vector(new Cell, new Cell, new Cell)
    )
  }

  def play(e: Char, x: Int, y: Int): String = {
    if (x < 0 || x > 2 || y < 0 || y > 2)
      "invalid move"
    else
      cells(x)(y).set(e)

    displayBoard()
    didSomeoneWin()
  }


  def displayBoard(): Unit = {
    for (a <- cells) {
      for (b <- a) {
        print(b.entry + "|")
      }
      println("___")
    }
  }

  def didSomeoneWin(): String = {
    var rValue = "No one won yet"
    for (i <- Range(0, 3)) {
      if (
        ((cells(i)(0).entry == cells(i)(1).entry && cells(i)(0).entry == cells(i)(2).entry && Set('X', 'O').contains(cells(i)(0).entry)) ||
        (cells(0)(i).entry == cells(1)(i).entry && cells(0)(i).entry == cells(2)(i).entry && Set('X', 'O').contains(cells(0)(i).entry)) ||
        (cells(0)(0).entry == cells(1)(1).entry && cells(2)(2).entry == cells(0)(0).entry && Set('X', 'O').contains(cells(0)(0).entry)) ||
        (cells(0)(2).entry == cells(1)(1).entry && cells(2)(0).entry == cells(1)(1).entry && Set('X', 'O').contains(cells(1)(1).entry)))
      ) {
        rValue =  "Game over"
        clearCells
      }
    }
    rValue
  }

}

package com.rohitpothuri.summary2

class Cell {
  var entry = ' '

  def set(e: Char): String = {
    if (entry == ' ' && (e == 'X' || e == 'O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}

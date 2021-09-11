package com.interfaceSegregation

object MediaPlayer extends App{
  val VlcMediaPlayer = () => {
    "Play Audio & Video on Vlc Player"

  }
  println(VlcMediaPlayer())

  val DivMediaPlayer = () => {
    "Play Audio & Video on Div Player"
  }
  println(DivMediaPlayer())

  val WinAmpPlayer = () => {
    "Play Audio on WinAmp"
  }
  println(WinAmpPlayer())
}

package com.github

package object shvahabi {
  def msg(args: String*) =
    s"""Hello ${args.lift(0).getOrElse("world")}!"""
}

package com.tradition.akkasocket.shared

object SharedMessage {
  case class CodeRequest(code: Code)
  case class CodeResponse(code: Code)
  case class JayRequest(s: String)
  case class JayResponse(s: String)

  case class ServerRequest(s:String)
  case class ServerResponse(s:String)
}

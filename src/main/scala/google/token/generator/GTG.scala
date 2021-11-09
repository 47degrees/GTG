package google.token.generator

import com.google.auth.oauth2.{GoogleCredentials, IdTokenCredentials, IdTokenProvider}

object GTG extends App {
  println(IdTokenCredentials
          .newBuilder()
          .setIdTokenProvider(GoogleCredentials.getApplicationDefault().asInstanceOf[IdTokenProvider])
          .setTargetAudience(args(0))
          .build()
          .refreshAccessToken()
          .getTokenValue)
}


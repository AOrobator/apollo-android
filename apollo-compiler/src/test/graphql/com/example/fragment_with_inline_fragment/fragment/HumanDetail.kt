// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface HumanDetail : GraphqlFragment {
  val __typename: String

  /**
   * What this human calls themselves
   */
  val name: String

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment HumanDetails on Human {
        |  __typename
        |  name
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): HumanDetail {
      return HumanDetailsImpl_ResponseAdapter.fromResponse(reader)
    }

    fun Mapper(): ResponseFieldMapper<HumanDetail> {
      return ResponseFieldMapper { reader ->
        HumanDetailsImpl_ResponseAdapter.fromResponse(reader)
      }
    }
  }
}
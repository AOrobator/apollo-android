// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_same_type_condition.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface DroidDetails2 : GraphqlFragment {
  val __typename: String

  /**
   * This droid's primary function
   */
  val primaryFunction: String?

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment DroidDetails2 on Droid {
        |  __typename
        |  primaryFunction
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): DroidDetails2 {
      return DroidDetails2Impl_ResponseAdapter.fromResponse(reader)
    }

    fun Mapper(): ResponseFieldMapper<DroidDetails2> {
      return ResponseFieldMapper { reader ->
        DroidDetails2Impl_ResponseAdapter.fromResponse(reader)
      }
    }
  }
}
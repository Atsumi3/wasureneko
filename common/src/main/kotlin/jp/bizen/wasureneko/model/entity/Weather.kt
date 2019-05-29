package jp.bizen.wasureneko.model.entity

/**
 * 天気を表すデータクラス
 * 天気をenumで持つかは悩み
 */
data class Weather (val location: String, val content: String)
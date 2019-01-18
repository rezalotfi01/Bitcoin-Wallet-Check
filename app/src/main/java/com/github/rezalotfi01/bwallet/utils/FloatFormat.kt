package com.github.rezalotfi01.bwallet.utils

fun Float.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

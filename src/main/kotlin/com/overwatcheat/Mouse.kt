package com.overwatcheat

import com.overwatcheat.User32.mouse_event

const val MOUSEEVENTF_MOVE = 0x0001
const val MOUSEEVENTF_ABSOLUTE = 0x8000

fun mouse(x: Int, y: Int, flags: Int = MOUSEEVENTF_MOVE) = mouse_event(flags, x, y, 0, 0)
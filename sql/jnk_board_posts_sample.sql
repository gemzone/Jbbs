USE [Jbbs]
GO

/****** Object:  Table [dbo].[jnk_board_posts_sample]    Script Date: 2016-07-18 ¿ÀÀü 12:54:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[jnk_board_posts_sample](
	[post_id] [bigint] NOT NULL,
	[user_id] [bigint] NULL,
	[password_sha2_512] [varbinary](64) NULL,
	[password_sha3] [varbinary](128) NULL,
	[name] [nvarchar](20) NULL,
	[title] [nvarchar](250) NULL,
	[text] [nvarchar](max) NULL,
	[file1] [nvarchar](255) NULL,
	[file2] [nvarchar](255) NULL,
	[link1] [nvarchar](255) NULL,
	[link2] [nvarchar](255) NULL,
	[ip] [varchar](16) NULL,
	[hit_count] [int] NULL,
	[comment_count] [int] NULL,
	[is_hide] [bit] NOT NULL,
	[register_time] [datetime] NULL,
 CONSTRAINT [PK_jnk_board_posts_sample_post_id] PRIMARY KEY CLUSTERED 
(
	[post_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[jnk_board_posts_sample] ADD  CONSTRAINT [DF_jnk_board_posts_sample_is_hide]  DEFAULT ((0)) FOR [is_hide]
GO

ALTER TABLE [dbo].[jnk_board_posts_sample] ADD  CONSTRAINT [DF_jnk_board_posts_sample_register_time]  DEFAULT (getdate()) FOR [register_time]
GO



USE [Jbbs]
GO

/****** Object:  Table [dbo].[jnk_user]    Script Date: 2016-07-18 ¿ÀÀü 12:54:54 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[jnk_user](
	[user_id] [bigint] NOT NULL,
	[group_id] [int] NOT NULL CONSTRAINT [DF_user_group_id]  DEFAULT ((0)),
	[id] [nvarchar](20) NOT NULL,
	[password_sha2_512] [varbinary](64) NULL,
	[password_sha3] [varbinary](128) NULL,
	[name] [nvarchar](20) NOT NULL,
	[email] [nvarchar](250) NOT NULL,
	[level] [tinyint] NOT NULL CONSTRAINT [DF_user_level]  DEFAULT ((9)),
	[point] [int] NOT NULL CONSTRAINT [DF_user_point]  DEFAULT ((0)),
	[comment] [nvarchar](1000) NOT NULL CONSTRAINT [DF_user_comment]  DEFAULT (''),
	[is_superadmin] [bit] NOT NULL CONSTRAINT [DF_user_is_superadmin]  DEFAULT ((0)),
	[register_time] [datetime] NULL CONSTRAINT [DF_user_register_time]  DEFAULT (getdate()),
 CONSTRAINT [PK_user] PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


